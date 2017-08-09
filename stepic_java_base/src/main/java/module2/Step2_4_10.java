package module2;

/**
 * Вам дан список ролей и сценарий пьесы в виде массива строчек.
 * <p>
 * Каждая строчка сценария пьесы дана в следующем виде:
 * Роль: текст
 * <p>
 * Текст может содержать любые символы.
 * <p>
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
 * <p>
 * Роль:
 * i) текст
 * j) текст2
 * ...
 * ==перевод строки==
 * <p>
 * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
 * <p>
 * Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.
 * <p>
 * Обратите внимание еще на несколько нюансов:
 * <p>
 * имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
 * название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
 * роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
 * в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
 * будьте внимательны, не добавляйте лишних пробелов в конце строк.
 * Sample Input 1:
 * roles:
 * Городничий
 * Аммос Федорович
 * Артемий Филиппович
 * Лука Лукич
 * textLines:
 * Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * Аммос Федорович: Как ревизор?
 * Артемий Филиппович: Как ревизор?
 * Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * Аммос Федорович: Вот те на!
 * Артемий Филиппович: Вот не было заботы, так подай!
 * Лука Лукич: Господи боже! еще и с секретным предписаньем!
 * Sample Output 1:
 * Городничий:
 * 1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * 4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * <p>
 * Аммос Федорович:
 * 2) Как ревизор?
 * 5) Вот те на!
 * <p>
 * Артемий Филиппович:
 * 3) Как ревизор?
 * 6) Вот не было заботы, так подай!
 * <p>
 * Лука Лукич:
 * 7) Господи боже! еще и с секретным предписаньем!
 * <p>
 * <p>
 * Sample Input 2:
 * roles:
 * qwe
 * textLines:
 * qwe: fwoeszilpplduh:d ?tianwtzh!wsrokk!?
 * qwe: xg.lvihhae.tv xgmbzwy.??lesf?ozvguaa t:gmbr
 * qwe: vb!n
 * qwe: h qpnjeglv.l.eott
 * qwe: fpcxd,dxu!xid::tct:gvftik.bup,qrcr.ubv .gxwquh,hckjonmk!oavsaklo.iochoscuuy
 * qwe: rq,rnqxzf?lkas,sow  zavzqmxehi zqemsmamk
 * qwe: dmbwdyfdr!razfn?lsrvpggrm??,pphkcgepyhw
 * qwe: vb?vk?.aoneshtoh!xshoyxcua vaajyprfqurcjs:
 * qwe: ?o,v,w:.mhntuvbaohhbvc,,kl!g,qds,birvx,wrzz.:.j:d.hk!oi.yifszrbzpctdk.qmxkj,fuvep!c?gcrawiqmwvnxy
 * qwe: .?vhygbha!wldkaglgg:rnr?
 * Sample Output 2:
 * qwe:
 * 1) fwoeszilpplduh:d ?tianwtzh!wsrokk!?
 * 2) xg.lvihhae.tv xgmbzwy.??lesf?ozvguaa t:gmbr
 * 3) vb!n
 * 4) h qpnjeglv.l.eott
 * 5) fpcxd,dxu!xid::tct:gvftik.bup,qrcr.ubv .gxwquh,hckjonmk!oavsaklo.iochoscuuy
 * 6) rq,rnqxzf?lkas,sow  zavzqmxehi zqemsmamk
 * 7) dmbwdyfdr!razfn?lsrvpggrm??,pphkcgepyhw
 * 8) vb?vk?.aoneshtoh!xshoyxcua vaajyprfqurcjs:
 * 9) ?o,v,w:.mhntuvbaohhbvc,,kl!g,qds,birvx,wrzz.:.j:d.hk!oi.yifszrbzpctdk.qmxkj,fuvep!c?gcrawiqmwvnxy
 * 10) .?vhygbha!wldkaglgg:rnr?
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step2_4_10 {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    result.append(i + 1).append(")").append(textLines[i].substring(role.length() + 1)).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}

//1
// 3. можно вызвать методы классов Int, Integer, RichInt

//2
import math.{sqrt, pow}
sqrt(3)
pow(res0, 2) //отличается из-за потери точности

//3
// res это val

//4
"crazy" * 3 // * -- определен в StringOps

//5
10 max 2 //RichInt

//6
BigInt(2).pow(1024)

//7
import BigInt.{probablePrime}
import util.Random
probablePrime(100, Random)

//8
probablePrime(100, Random).toString(36)

//9
"Scala".head
"Scala".last

//10
"Scala".takeRight(2)
"Scala".dropRight(2)
"Scala".drop(2)
"Scala".take(2)
//отличаются от substring() тем что не падают если задать слишком большой(или отрицательный) аргумент,
//но видимо при этом какието дополнительные проверки происходят.
println "Welcome to Groovy"
println "Today is" + Date().toString()

def sum = 3+5
printlin "the sum is" + sum

System.out.println("Hello Test");

def beatles = ["John", "Paul", "Gerogre", "Ringo"]
for (int i =0; i< beatle.size(); i++) {      //(beatles in beatles   then just $beatles intead of ${beatles}
    def greeting = "Hello"    //$ is the G string
    println $greeting + beatles[i]
    println "${i*10}"
}

//ranges
def number = 1..10
for (num in number){
    println num
}

def range = 'a'..'g'
for (letter in range){
    println letter
}

def enum DAYS{
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}
def weekdays = DAYS.MON..DAYS.FRI
for (days in weekdays){
    println days
}
println "Extents: "
println weekdays.from //MON
println weekdays.to  //FRI

def numbers = 0..9
for (num in numbers){
    if(isEven(num)) {
        println num
    }
}
def isEven(num){
    num%2 == 0
}

////////////////////////////////////////////////
def myClosure = {
    println "Hello"
    println new Date()
}
for (i in 1..3) {               // or (1..3).each ({ i->
    myClosure()                 //lambda
    println "In a closure : $it"
    sleep(1000)
}
////////////////////////////////////////////////
(1..10).findAll({return it%2 ==0}).each({
    println "In a closure : $it"
})

//def can use for dynamic types, they use different class on run time
def one = 1
one = "one"
//dynamic


























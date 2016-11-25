/**
 * Created by jarvis on 2016. 11. 25..
 */

fun main(args: Array<String>) {
    var hello : String = "Hello arahansa"
    println(hello)
    // hello = null : error

    var hello2 :String? = "Hello arahansa"
    hello2 = null
    // println(hello2+""+hello2.length) null length err
    val l = if (hello2 != null) (hello2 as String).length else -1
    println(l)

    // 안전호출과 엘비스 오퍼레이터
    // 안전호출 ?.
    println("안전호출로 불러온 값 ?. : "+hello2 ?.length ?: -1)

    // 강제호출은 !! 여기선 에러
    // println("강제호출로 불러오기 !! : " + hello2!!.length)

    println("자동형변환된 함수 :: "+getStringLength("arahansa"))

    println("숫자 파싱 ? ")
    parseNumber("1")
    println("숫자 파싱 ? ")
    parseNumber("하하")

}

fun getStringLength(something: Any): Int? {
    if (something is String) {
        // 자동으로 형변환이 되어있음... !!
        return something.length
    }
    return null
}

fun parseInt(a:Any): Int {
    return Integer.parseInt(a.toString())
}

fun parseNumber(a:Any){
    when (a) {
        parseInt(a) -> println("s encodes x")
        else -> println("s does not encode x")
    }
}
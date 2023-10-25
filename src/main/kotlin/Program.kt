fun main(args: Array<String>){
    println("Welcome to Chapter 9 \n")

    fun printHighlighted(text:String){
        System.err.println(text)

    }

    //Make an array;
    var array = arrayOf(1,2,3,4,5)

    //Make an array initialized with nulls
    var array2 = arrayOfNulls<String>(2)

    //array2= emptyArray()

    //fin out the size of the array:
    //println(array2.size)

    //reverse the order of the items in the array
    array.reverse()
    for (element in array){
        println(element)
    }

    //Find out if it contains something:
    val isContains:Boolean = array.contains(1)
    println("5 is in the array expression is "+if(isContains) "true" else "false")

    //Calculate the sum of its items (if they're numeric)
    println(array.sum()) //5*6/2=15

    //Calculate the average of its items (if they are numeric)
    println(array.average())

    //Find out the minumum or maximum items (works for numbers,
    //Strings, Chars, and Booleans)

    //printHighlighted(array.min().toString())

    //As you can see, if sort () function is used for a data which data types is String
    //Sort function make the array orders according to string's length
    //increasing order...

    var array4:Array<String> = arrayOf("12","123","12345","1")
    array4.sort()
    for(element in array4){
        println(element)
    }

    //As you can see, if sort() function is used in data type of Int,i
    //the function makes the array order natural order...

    var array5:Array<Int> = arrayOf(1,2,3,4,5,6)

    for (element in array5){
        println(element.toString())
    }


    /**
     * Difference between sort() and sorted() function, sort() function makes the array natural sort which calls on it,
     * On the other hand sorted() function returns the copy of sorted version of the current array..
     *
     *
     */

    //Example using of sorted() function...


    var array6:Array<Int> =arrayOf(6,5,4,3,3,2,1)

    var array7= array6.sorted()


    //This is the copy version of sorted array
    for(element in array7){
        println(element.toString())
    }

    //This is the original array

    for(element in array6){
        printHighlighted(element.toString())


    }











}
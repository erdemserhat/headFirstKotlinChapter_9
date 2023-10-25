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
        println(element.toString())
    }

    /**
     * But there are things an array can not handle ;
     * for example you can not change an array's size dynamically
     */

    //So like this;

    var array10:Array<Int?> = arrayOfNulls(2)
    array10.set(0,4)
    array10.set(1,5)

    for (element in array10){
        println(element.toString())
    }

    //List, Sets, Maps

    /**
     * When sequence matters : List
     * When uniqueness  matters : Set
     * When key-value matters :Map
     */

    //Lists

    var list:List<Int> = listOf(1,2,3,4,5)


    for (element in list){
        println(element.toString())
    }

    var list2:List<String>
    //printHighlighted(list.get(2).toString())


    /**
     * contains() function defines whether the related array or list contain the
     * the argument which is passed as parameter the function
     */

    //So like this;

    var myList: List<String>
    myList = listOf("computer","keyword","processor")

    if(myList.contains("keyword")) println(myList.indexOf("keyword"))

    /**
     * important Note ;
     * with the data type of Array you can easily manipulate member of array..
     * but this situation sometimes is not wanted by developer
     * so that's why list data type is released
     * but sometimes you want to manipulate members of the list and use
     * the functions of the list data type;
     * and In this situation you can use MutableList
     * Mutable = allow you Manipulate member
     */


    var mutableList: MutableList<String>
    mutableList = mutableListOf("1,2,3,4,5,6","java","c#")
    mutableList.set(0,"kotlin")

    println(mutableList.get(0))

    //When you work with Mutable array types you can add members dynamically

    mutableList.add("Python")
    println(mutableList.get(mutableList.size-1))

    //You can remove items from arrays as well

    mutableList.removeAt(0)
    mutableList.remove("Python")

    for(elemenet in mutableList){
        println(elemenet)
    }

    var exampleMutableList:MutableList<Int>
    exampleMutableList = mutableListOf(5,3,7,8,5,3)


    /**
     * sort() function makes the array order as natural order and
     * reverse() function reverse the sequence of the related array..
     * sort() + reverse() function make the array orders  the (un)natural order.
     *
     *
     */
    exampleMutableList.sort()
    exampleMutableList.reverse()

    for ( element in exampleMutableList){
        //printHighlighted(element.toString())
    }
    println()

    exampleMutableList.shuffle()

    for(element in exampleMutableList){
        println(element.toString())
    }

    //adAll keyword makes you allow the add bulk values ;
    var originalList:MutableList<Int> = mutableListOf(1,2,3)
    var toAdd:MutableList<Int> = mutableListOf(3,4,5)
    var toRemove:MutableList<Int> = mutableListOf(1,2)
    var toRetain:MutableList<Int> = mutableListOf(5)

    //Use the addAll function to add all the items that are held in another collection
    originalList.addAll(toAdd)
    //the removeAll function removes items that are held in another collection
    originalList.removeAll(toRemove)
    //And the retainAll function retains all the items that are held in another collection and removes everything else:
    originalList.retainAll(toRetain)
    //You can also use the clear function to remove every item like this:
    originalList.clear()

    //or take a copy of the entire MutableList




    for(element in originalList){
        printHighlighted(element.toString())
    }

    //snapshot = enstantane veri görünütüsü
    val copyMutableList:MutableList<Int> = originalList.toMutableList();
    var coptList = originalList.toList();
    copyMutableList.addAll(mutableListOf(1,2,3,4,5))
    var myArray = arrayOf(1,2,3,4,5)
    println(myArray) //arrays cannot be printable directly returns the items
    println(copyMutableList) // but lists can be printable

    //Lists and Mutable (can be manipulated) Lists can hold duplicate values...
    //but in Sets, uniqueness is the key point so that they can not..





















}
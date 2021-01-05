import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/* Executes Main Thread */
fun main(){
    println("Main Program Starts : ${Thread.currentThread().name}")

    /* create Worker Thread or  Background thread did not block the main thread*/
    /*thread {
        println("Fake work Starts : ${Thread.currentThread().name}")
        Thread.sleep(2000)  //pretend doing some work like uploading file
        println("Fake work finished : ${Thread.currentThread().name}")
    }*/

    //creating background coroutine that runs in background
     GlobalScope.launch{
        println("Fake work Starts : ${Thread.currentThread().name}")
        Thread.sleep(2000)  //pretend doing some work like uploading file
        println("Fake work finished : ${Thread.currentThread().name}")
    }

    /*
    /* Delay : Thread: 1*/
    GlobalScope.launch{
        println("Fake work Starts : ${Thread.currentThread().name}")
        delay(1000)  //suspends the coroutine (bt t1 is not blocked)
        println("Fake work finished : ${Thread.currentThread().name}")
    }

    /* its creates the new coroutine that block current main thread*/
    runBlocking {
        delay(2000)  //wait for previous corutine to finished its task
    }
*/
    //Blocks the current main thread & wait for coroutine to finished
    Thread.sleep(2000)
    println("Main Program Starts : ${Thread.currentThread().name}")

}
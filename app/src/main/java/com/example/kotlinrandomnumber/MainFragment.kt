package com.example.kotlinrandomnumber

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.*
import java.lang.Runnable
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@InternalCoroutinesApi
class MainFragment : Fragment(), Runnable {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private val topicList = mutableListOf("Main Text", "Topic1", "Topic2", "Topic3", "Topic4", "Topic5", "Topic6", "Topic7")
//    private val mainFragmentText: TextView = requireView().findViewById(R.id.mainFragmentText)

    override fun run() {

    }

    private val randomNumber = (0 until(100)).random()

    //    private fun startCount(): Unit {
//    private val random: Int = (0 until(topicList.size)).random()

//    private val handler: Handler? = null
//        handler?.post(run)
//    }

//    private val run = Runnable {
//        run {
//            mainFragmentText.text = topicList[random]
//            handler?.postDelayed(this, 1000)
//        }
//    }

//    @InternalCoroutinesApi
//    private fun startRepeatingJob(timeInterval: Long): Job {
//        return CoroutineScope(Dispatchers.Default).launch {
//            while (NonCancellable.isActive) {
//                // add your task here
//                doSomething()
//                delay(timeInterval)
//            }
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val mainFragmentText: TextView = view.findViewById(R.id.mainFragmentText)

        val splashScreenTimeOff = 3000L
//
//        val handler = Handler(Looper.getMainLooper())
//        val run = Runnable {
//            run {
//                Log.d("Check", "Check the dddd value")
////                mainFragmentText.text = topicList[randomNumber]
//                mainFragmentText.text = randomNumber.toString()
//                handler.postDelayed(this, splashScreenTimeOff)
//            }
//        }
//
//        handler.postDelayed(run, splashScreenTimeOff)
//        val mainHandler = Runnable {
//            run {
//                Log.d("Check Number", "Check number is changing or not")
//
//                if (mainFragmentText.text != topicList[0]) {
//                    mainFragmentText.text = topicList[0]
//                }
//            }
//        }

//        val randomRunnable = Runnable {
//            run {
//                Log.d("Random", "Random Value")
//                mainFragmentText.text = topicList[random]
//                handler.postDelayed(this, 5000L)
//            }
//        }

//        handler.postDelayed(mainHandler, splashScreenTimeOff)
//        handler.post(randomRunnable)

//        handler?.post(run)
//        val t: Thread = object: Thread(){
//            override fun run() {
//                Thread.sleep(1000)
//                run {
//
//                }
//                super.run()
//            }
//        }
//
//        CoroutineScope(Dispatchers.Default).launch {
//            while (NonCancellable.isActive) {
//                // add your task here
//                val random: Int = (0 until(100)).random()
//                mainFragmentText.text = random.toString()
//                delay(1000L)
//            }
//        }

        val testHandler = Handler(Looper.getMainLooper())
        testHandler.post(object: Runnable {
            override fun run() {
                val random: Int = (0 until(100)).random()
                mainFragmentText.text = random.toString()
                testHandler.postDelayed(this, 1000)
            }

        })

//        mainFragmentText.setOnClickListener {
//            val random: Int = (0 until(topicList.size)).random()
//            val random: Int =
//            mainFragmentText.text = topicList[randomNumber]
//            val random: Int = (0 until(100)).random()
//            mainFragmentText.text = random.toString()

//            val textRunnable = Runnable {
//                run {
//                    Log.d("Check", "Check the value")
////                    mainFragmentText.text = topicList[randomNumber]
//                    mainFragmentText.text = random.toString()
//                }
//            }
//
//            handler.postDelayed(textRunnable, splashScreenTimeOff)

//            Log.d("Detail Fragment Page", "Go to Detail Fragment Page from Main Fragment Page")
//            findNavController().navigate(R.id.action_mainFragment_to_resultFragment)
//        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
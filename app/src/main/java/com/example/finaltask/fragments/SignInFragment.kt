package com.example.finaltask.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.NavController
import com.example.finaltask.R
import java.util.regex.Pattern


class SignInFragment : Fragment() {

    private lateinit var signinBtn:Button
    private lateinit var emailED:EditText
    private lateinit var passwordEd:EditText
    private lateinit var email:String
    private lateinit var password:String

    companion object {
        const val TAG = "LoginFragment"
        const val SIGN_IN_RESULT_CODE = 1001
    }

    val EMAIL_ADDRESS_PATTERN = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+" )

    fun isValidString(str: String): Boolean{
        return EMAIL_ADDRESS_PATTERN.matcher(str).matches()
    }

    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)
        signinBtn = view.findViewById(R.id.signIn)
        emailED = view.findViewById(R.id.userName)
        passwordEd = view.findViewById(R.id.passWord)


//        signinBtn.setOnClickListener(View.OnClickListener { view ->
//            requireActivity().supportFragmentManager.beginTransaction()
//        })

        email = emailED.text.toString()
        password = emailED.text.toString()

        if (isValidString(email)&& password.length>=8){
            signinBtn.setOnClickListener(View.OnClickListener { view ->
                requireActivity().supportFragmentManager.beginTransaction()
            })
        }
        else{
            Toast.makeText(requireContext(),"Invalid login",Toast.LENGTH_SHORT).show()
        }


        return view
    }


}
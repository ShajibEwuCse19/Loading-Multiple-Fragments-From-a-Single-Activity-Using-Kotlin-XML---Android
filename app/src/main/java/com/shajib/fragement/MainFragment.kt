package com.shajib.fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * @author Shajib
 * @since Aug 01, 2024
 **/
class MainFragment : Fragment() {

    //create view from fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)//inflate and return the view

        //my tasks in the fragment view
        val editTextName = view.findViewById<EditText>(R.id.etName)
        val editTextEmail = view.findViewById<EditText>(R.id.etEmail)
        val buttonSubmit = view.findViewById<Button>(R.id.btSubmit)

        buttonSubmit.setOnClickListener {
            val text1 = editTextName.text.toString()
            val text2 = editTextEmail.text.toString()
            Toast.makeText(
                requireContext(),
                "Your name = $text1 and Email = $text2",
                Toast.LENGTH_SHORT
            ).show()
        }
        return view //return
    }

    //go to the second fragment from here after clicking the continue button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonContinue = view.findViewById<Button>(R.id.btSubmit)
        buttonContinue.setOnClickListener {
            //casting (activity as MainActivity) and call the loadSecondFragment() from MainActivity
            //(activity as MainActivity) -> creating connection with parent activity (MainActivity)
            (activity as MainActivity).loadSecondFragment()
        }
    }
}
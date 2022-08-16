package com.pede.pede

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Baca.newInstance] factory method to
 * create an instance of this fragment.
 */
class Baca : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var bacaImageButton1: ImageButton
    private lateinit var bacaImageButton2: ImageButton
    private lateinit var bacaImageButton3: ImageButton
    private lateinit var bacaImageButton4: ImageButton
    private lateinit var bacaImageButton5: ImageButton
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_baca, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView = view.findViewById(R.id.backgroundImageview) as ImageView
        bacaImageButton1 = view.findViewById(R.id.ib_baca1)
        bacaImageButton2 = view.findViewById(R.id.ib_baca2)
        bacaImageButton3 = view.findViewById(R.id.ib_baca3)
        bacaImageButton4 = view.findViewById(R.id.ib_baca4)
        bacaImageButton5 = view.findViewById(R.id.ib_baca5)
        Glide.with(this).load(R.drawable.bgr_).into(imageView)
        bacaImageButton1.setOnClickListener {
            (activity as HomeActivity?)!!.openFragment(FragmentBaca1())
        }
        bacaImageButton2.setOnClickListener {
            (activity as HomeActivity?)!!.openFragment(FragmentBaca2())
        }
        bacaImageButton3.setOnClickListener {
            (activity as HomeActivity?)!!.openFragment(FragmentBaca3())
        }
        bacaImageButton4.setOnClickListener {
            (activity as HomeActivity?)!!.openFragment(FragmentBaca4())
        }
        bacaImageButton5.setOnClickListener {
            (activity as HomeActivity?)!!.openFragment(FragmentBaca5())
        }

    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Baca.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Baca().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
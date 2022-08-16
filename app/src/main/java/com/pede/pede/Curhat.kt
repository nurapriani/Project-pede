package com.pede.pede

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Curhat.newInstance] factory method to
 * create an instance of this fragment.
 */
class Curhat : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var imageView: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var curhatImageButton: ImageButton

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
        return inflater.inflate(R.layout.fragment_curhat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView  = view.findViewById(R.id.backgroundImageview) as ImageView
        imageView2 = view.findViewById(R.id.ivCurhat) as ImageView
        curhatImageButton = view.findViewById(R.id.ib_curhat) as ImageButton
        Glide.with(this).load(R.drawable.bgr_).into(imageView)
        Glide.with(this).load(R.drawable.ic_ppl_).into(imageView2)
        curhatImageButton.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://wa.link/8zo7q7"))
            startActivity(urlIntent)
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Curhat.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Curhat().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
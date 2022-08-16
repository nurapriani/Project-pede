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
 * Use the [Video.newInstance] factory method to
 * create an instance of this fragment.
 */
class Video : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var videoImageButton1: ImageButton
    private lateinit var videoImageButton2: ImageButton
    private lateinit var videoImageButton3: ImageButton
    private lateinit var videoImageButton4: ImageButton
    private lateinit var videoImageButton5: ImageButton
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
        return inflater.inflate(R.layout.fragment_video, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView = view.findViewById(R.id.backgroundImageview) as ImageView
        videoImageButton1 = view.findViewById(R.id.ib_video1) as ImageButton
        videoImageButton2 = view.findViewById(R.id.ib_video2) as ImageButton
        videoImageButton3 = view.findViewById(R.id.ib_video3) as ImageButton
        videoImageButton4 = view.findViewById(R.id.ib_video4) as ImageButton
        videoImageButton5 = view.findViewById(R.id.ib_video5) as ImageButton
        Glide.with(this).load(R.drawable.bgr_video).into(imageView)
        videoImageButton1.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=eamhuoKR95w"))
            startActivity(urlIntent)
        }
        videoImageButton2.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=VGxNZqDdLfI"))
            startActivity(urlIntent)
        }
        videoImageButton3.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=NiSNcEM4cOE"))
            startActivity(urlIntent)
        }
        videoImageButton4.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=Vb1e3bL1XlU"))
            startActivity(urlIntent)
        }
        videoImageButton5.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=7kT0-YGkgYg"))
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
         * @return A new instance of fragment Video.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Video().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
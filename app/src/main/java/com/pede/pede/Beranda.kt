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
 * Use the [Beranda.newInstance] factory method to
 * create an instance of this fragment.
 */
class Beranda : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var btn_baca : ImageButton
    lateinit var btn_komik : ImageButton
    lateinit var btn_video : ImageButton
    lateinit var btn_survey : ImageButton
    lateinit var btn_curhat : ImageButton
    lateinit var imageView : ImageView

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
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView = view.findViewById(R.id.backgroundImageview) as ImageView
        Glide.with(this).load(R.drawable.bgr_).into(imageView)
        btn_baca = view.findViewById(R.id.ib_baca) as ImageButton
        btn_komik = view.findViewById(R.id.ib_komik) as ImageButton
        btn_video = view.findViewById(R.id.ib_video) as ImageButton
        btn_curhat = view.findViewById(R.id.ib_curhat) as ImageButton
        btn_survey = view.findViewById(R.id.ib_survey) as ImageButton
        btn_baca.setOnClickListener {
            (activity as HomeActivity?)!!.openBaca()
        }
        btn_komik.setOnClickListener {
            (activity as HomeActivity?)!!.openKomik()
        }
        btn_video.setOnClickListener {
            (activity as HomeActivity?)!!.openVideo()
        }
        btn_curhat.setOnClickListener {
            (activity as HomeActivity?)!!.openCurhat()
        }
        btn_survey.setOnClickListener {
            (activity as HomeActivity?)!!.openSurvey()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Beranda.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Beranda().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
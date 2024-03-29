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
 * Use the [Komik.newInstance] factory method to
 * create an instance of this fragment.
 */
class Komik : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    private lateinit var komikImageButton1: ImageButton
    private lateinit var komikImageButton2: ImageButton
    private lateinit var komikImageButton3: ImageButton
    private lateinit var komikImageButton4: ImageButton
    private lateinit var komikImageButton5: ImageButton
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
        return inflater.inflate(R.layout.fragment_komik, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView = view.findViewById(R.id.backgroundImageview) as ImageView
        komikImageButton1 = view.findViewById(R.id.ib_komik1) as ImageButton
        komikImageButton2 = view.findViewById(R.id.ib_komik2) as ImageButton
        komikImageButton3 = view.findViewById(R.id.ib_komik3) as ImageButton
        komikImageButton4 = view.findViewById(R.id.ib_komik4) as ImageButton
        komikImageButton5 = view.findViewById(R.id.ib_komik5) as ImageButton
        Glide.with(this).load(R.drawable.bgr_).into(imageView)
        komikImageButton1.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://komik.pendidikan.id/online/komik/sekolah_yes_nikah_muda_no_way/"))
            startActivity(urlIntent)
        }
        komikImageButton2.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://komik.pendidikan.id/online/komik/hamil_diluar_nikah/"))
            startActivity(urlIntent)
        }
        komikImageButton3.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://komik.pendidikan.id/online/komik/waspada_gambar_pornografi/"))
            startActivity(urlIntent)
        }
        komikImageButton4.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://komik.pendidikan.id/online/komik/empat_sekawan_mengguncang_dunia/"))
            startActivity(urlIntent)
        }
        komikImageButton5.setOnClickListener {
            val urlIntent = Intent("android.intent.action.VIEW", Uri.parse("https://komik.pendidikan.id/online/komik/jauhi_napza_jauhi_bahayanya/"))
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
         * @return A new instance of fragment Komik.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Komik().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
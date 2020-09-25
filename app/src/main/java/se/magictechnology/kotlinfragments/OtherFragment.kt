package se.magictechnology.kotlinfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_other.*

class OtherFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    override fun onStart() {
        super.onStart()

        goThirdBtn.setOnClickListener {

            activity!!.supportFragmentManager.beginTransaction().add(R.id.fragHere, ThirdFragment()).addToBackStack("abc").commit()

        }
    }
}
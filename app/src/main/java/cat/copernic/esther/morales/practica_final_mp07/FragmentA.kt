package cat.copernic.esther.morales.practica_final_mp07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cat.copernic.esther.morales.practica_final_mp07.databinding.FragmentABinding
import kotlinx.android.synthetic.main.fragment_a.*


class FragmentA : Fragment() {

    private  var _binding: FragmentABinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        _binding = FragmentABinding.inflate(inflater, container, false)

        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buton1.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }

        binding.buton2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentC)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
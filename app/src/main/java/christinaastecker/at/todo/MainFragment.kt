package christinaastecker.at.todo

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import christinaastecker.at.todo.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var _binding: FragmentMainBinding // var --> can be changed
    private val binding: FragmentMainBinding get() = _binding // val -> constant - USE

    override fun onCreateView(
        // Inflate the layout for this fragment
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        binding.btnUser.setOnClickListener{
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserActivity())
            //RequireView().findNavController().navigate(R.id.action_mainFragment_to_userActivity)
        }
        return binding.root
    }
}
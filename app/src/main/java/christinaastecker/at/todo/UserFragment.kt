package christinaastecker.at.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import christinaastecker.at.todo.databinding.ActivityUserBinding
import christinaastecker.at.todo.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private lateinit var _binding: FragmentUserBinding
    private val binding: FragmentUserBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUserBinding.inflate(layoutInflater , container, false)

        var user = User(1,"Christina", "Astecker", "mypassword", false)
        binding.tvFirstName.text = user.firstName
        binding.tvLastName.text = user.lastName
        binding.switchActive.isChecked = user.isActive

        return binding.root
    }
}
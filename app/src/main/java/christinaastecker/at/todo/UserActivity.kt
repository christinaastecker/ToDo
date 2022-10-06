package christinaastecker.at.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import christinaastecker.at.todo.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var user = User(1,"Christina", "Astecker", "mypassword", false)
        binding.tvFirstName.text = user.firstName
        binding.tvLastName.text = user.lastName
        binding.switchActive.isChecked = user.isActive
    }

}
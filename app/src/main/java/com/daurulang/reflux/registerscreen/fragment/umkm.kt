import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.daurulang.reflux.R
import androidx.appcompat.app.AppCompatActivity
import com.daurulang.reflux.halamanlogin.Login
import com.daurulang.reflux.registerscreen.RegisterScreen5

class umkm : Fragment() {

    private lateinit var locationInput: EditText
    private lateinit var buttonDaftar: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_umkm, container, false)

        locationInput = view.findViewById(R.id.textLocationInput) // Replace with the actual ID
        buttonDaftar = view.findViewById(R.id.button) // Replace with the actual ID

        locationInput.setOnClickListener {
            startActivityForResult(Intent(requireContext(), RegisterScreen5::class.java), REQUEST_MAP)
        }
        buttonDaftar.setOnClickListener {
            startActivity(Intent(requireContext(), Login::class.java))
        }

        return view
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_MAP && resultCode == AppCompatActivity.RESULT_OK) {
            val selectedLocation = data?.getStringExtra(RegisterScreen5.EXTRA_SELECTED_LOCATION)
            locationInput.setText(selectedLocation)
        }
    }

    companion object {
        private const val REQUEST_MAP = 123
        private const val ANIMATION_DURATION = 500L
    }
}

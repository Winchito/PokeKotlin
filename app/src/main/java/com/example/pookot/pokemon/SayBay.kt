package com.example.pookot.pokemon

import android.widget.Toast
import com.example.pookot.MainActivity

interface sayBay{
    var dato: Int
    fun sayBye() { Toast.makeText(MainActivity.maincontext, "ByeBye!", Toast.LENGTH_SHORT).show()  }
}
interface sayBay2{
    fun sayBye2() { Toast.makeText(MainActivity.maincontext, "ByeBye!", Toast.LENGTH_SHORT).show()  }
}
interface sayBay3{
    fun sayBye3() { Toast.makeText(MainActivity.maincontext, "ByeBye!", Toast.LENGTH_SHORT).show()  }
}

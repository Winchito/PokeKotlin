package com.example.pookot

import android.widget.Toast

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

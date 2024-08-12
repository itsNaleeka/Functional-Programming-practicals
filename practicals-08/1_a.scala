object Cipher {
  def encrypt(text: String, shift: Int): String ={
    val encryptedText = text.map { c =>
        if (c.isLetter) {
            val shiftedChar = (c + shift).toChar
            if (shiftedChar.isLetter) shiftedChar else c
        } else {
            c
        }
    }
    encryptedText
  }

  def decrypt(text: String, shift: Int): String = {
    val decryptedText = text.map { c =>
        if(c.isLetter) {
            val deShiftedChar = (c - shift).toChar
            if (deShiftedChar.isLetter) deShiftedChar else c
        } else {
            c
        }
    }
    decryptedText
  }

  def ceasarCipher(text:String, shift:Int, op:(String, Int) => String): String = {
    op(text, shift)
  }


  def main(args: Array[String]): Unit = {
    val text = "Hello world369"
    val shift = 1
    val encrypted = ceasarCipher(text, shift, encrypt)
    println(s"Encrypted text : $encrypted")

    val decrypted = ceasarCipher(encrypted, shift, decrypt)
    println(s"Decrypted text : $decrypted")
    
  }
}
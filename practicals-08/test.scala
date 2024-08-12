object CipherTest {
    def encrypt(text: String, shift:Int): Unit = {
        val encryptedText = text.map{ c => 
            if(c.isLetter){
                val shiftedChar = (c + shift).toChar
                if (shiftedChar.isLetter) shiftedChar else c 
            } else {
                c
            }
        }
        decrypt(encryptedText, shift)
    }

    def decrypt(text:String, shift:Int): Unit = {
        println(s"Encrypted text : $text")
        val decryptedText = text.map{ c =>  
            if(c.isLetter){
                val deshiftedChar = (c - shift).toChar
                if(deshiftedChar.isLetter) deshiftedChar else c
            } else c    
        }
        println(s"Decrypted Text : $decryptedText")
    }


    def main(args: Array[String]): Unit = {
        val text = "Helloooo World"
        encrypt(text, 1)
    }
}
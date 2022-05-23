package org.yaroshynska
import java.io._




def writeFile(filename: String, s: String): Unit = {
  val file = new File(filename)
  val bw = new BufferedWriter(new FileWriter(file, true))
  bw.write(s)
  bw.close()
}

//@main def main() =
//  writeFile("test.txt", "some text\n")
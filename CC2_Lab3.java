public class CC2_Lab3{
  public static void main(String[] args){
    char c = 'C', h ='H', a = 'A', r = 'R', i = 'I', t = 'T', y = 'Y', exclam = '!';
    long cc = c, hh = h, aa = a, rr = r, ii=i, tt=t, yy=y, exclamation = exclam;
    
    System.out.println(c + " - " + cc);
    System.out.println(h + " - " + hh);
    System.out.println(a + " - " + aa);
    System.out.println(r + " - " + rr);
    System.out.println(i + " - " + ii);
    System.out.println(t + " - " + tt);
    System.out.println(y + " - " + yy);
    System.out.println(exclam + " - " + exclamation);
    
    System.out.print(c +""+ h + "" + a + "" + r + "" + i + "" + t + "" + y + "" + exclam + "\n");
    
    long sum = cc + hh + aa + rr + ii + tt + yy + exclamation;
    long product = cc*hh*aa*rr*ii*tt*yy*exclamation;
    long average = (cc + hh + aa + rr + ii + tt + yy + exclamation)/8;
    long remainder = product%average;
    
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    System.out.println("Average: " + average);
    System.out.println("Remainder: " + remainder);
    
    }
     }
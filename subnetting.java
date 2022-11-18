import java.util.Scanner; public class subnetting {
static void printIpClass(String sourceString) { short len = 0;


int oct[] = new int[4]; String buf = "";

short cnt = 0; short i = 0;


len = (short) sourceString.length(); for (i = 0; i < len; i++) {
if (sourceString.charAt(i) != '.') { buf += sourceString.charAt(i);
}

if (sourceString.charAt(i) == '.' || i == len - 1) { oct[cnt++] = Integer.parseInt(buf);
buf = "";

}

}


System.out.println("Octete1 : " + oct[0]); System.out.println("Octete2 : " + oct[1]); System.out.println("Octete3 : " + oct[2]); System.out.println("Octete4 : " + oct[3]);

if (oct[0] >= 1 && oct[0] <= 126) { System.out.printf("Class A Ip Address.\n");
System.out.printf("subnet mask of class A is:" + "255.0.0.0");

} else if (oct[0] > 127 && oct[0] < 191) { System.out.printf("Class B Ip Address.\n");
System.out.printf("subnet mask of class A is:" + "255.255.0.0");

} else if (oct[0] > 191 && oct[0] < 224) { System.out.printf("Class C Ip Address.\n");
System.out.printf("subnet mask of class A is:" + "255.255.255.0");

} else if (oct[0] > 224 && oct[0] <= 239) { System.out.printf("Class D Ip Address.\n");
} else if (oct[0] > 239) { System.out.printf("Class E Ip Address.\n");
}

}

public static void main(String[] args) { Scanner SC = new Scanner(System.in); String ip;
int i = 0;

System.out.print("Enter valid IP address: "); ip = SC.next();
printIpClass(ip);

}

}

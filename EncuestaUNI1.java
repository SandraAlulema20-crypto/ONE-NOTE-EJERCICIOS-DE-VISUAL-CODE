import java.util.Scanner;
public class  EncuestaUNI1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in); int n; System.out.print("N: ");n=sc.nextInt();
  while(n<=0){System.out.print("N inválido: ");n=sc.nextInt();}
  int[] edad=new int[n], sem=new int[n]; double[] horas=new double[n];
  int sumaEdad=0,menos2=0,mayorEst=0; double sumaHoras=0,mayor=-1;
  for(int i=0;i<n;i++){
   System.out.print("Edad: ");edad[i]=sc.nextInt();
   while(edad[i]<16||edad[i]>80){System.out.print("Edad inválida: ");edad[i]=sc.nextInt();}
   System.out.print("Semestre: ");sem[i]=sc.nextInt();
   while(sem[i]<1||sem[i]>10){System.out.print("Semestre inválido: ");sem[i]=sc.nextInt();}
   System.out.print("Horas: ");horas[i]=sc.nextDouble();
   while(horas[i]<0||horas[i]>24){System.out.print("Horas inválidas: ");horas[i]=sc.nextDouble();}
   sumaEdad+=edad[i];sumaHoras+=horas[i];if(horas[i]<2)menos2++;
   if(horas[i]>mayor){mayor=horas[i];mayorEst=i+1;}
  }
  System.out.println("Promedio edad: "+(double)sumaEdad/n);
  System.out.println("Promedio horas: "+sumaHoras/n);
  System.out.println("Mayor horas: estudiante "+mayorEst);
  System.out.println("Menos de 2h: "+menos2);
  for(int s=1;s<=10;s++){int c=0;for(int i=0;i<n;i++)if(sem[i]==s)c++;System.out.println("Semestre "+s+": "+c);}
  sc.close();
 }
}

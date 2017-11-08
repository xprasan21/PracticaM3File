
import java.io.File;

public class FilesDragons
{
    // Lista el contenido de un fichero e indica cual el fichero y cual es directorio
    public static void InformacionDeFicherosYDirectorios()
    {
        File directorio = new File("C:\\eclipse");
        if(directorio.isDirectory())
        {
            String[] listado = directorio.list();

            for(int i = 0; i < listado.length; i++)
            {
                File examinar = new File("C:\\eclipse" + listado[i]);
                if(examinar.isDirectory())
                {
                    System.out.println("DIRECTORIO:\t" + listado[i]);
                    File directorio1 = new File("C:\\eclipse" + listado[i]);
                    String[] listado1 = directorio1.list();
                	for(int j = 0; j < listado1.length; j++)
                	{
                		File examinar1 = new File("C:\\eclipse" + listado[i] + "\\" + listado1[j]);
                		if(examinar1.isDirectory()) 
                		{
                			System.out.println("\tDIRECTORIO:\t" + listado1[j]);
                			File directorio2 = new File("C:\\" + listado[i] + "\\" + listado1[j]);
                			String[] listado2 = directorio2.list();
                			for(int k = 0; k < listado2.length; k++)
                			{
                				File examinar2 = new File("C:\\eclipse" + listado[i] + "\\" + listado1[j] + "\\" + listado2[k]);
                				if(examinar2.isDirectory())
                					System.out.println("\t\tDIRECTORIO:\t" + listado2[k]);
                				else 
                					System.out.println("\t\tFICHERO:\t" + listado2[k]);
                			}
                		}
                		else 
                            System.out.println("\tFICHERO:\t" + listado1[j]);	
                	}
                }
            }

            for(int i = 0; i < listado.length; i++)
            {
                File examinar = new File("C:\\eclipse" + listado[i]);
            	 if(!examinar.isDirectory())
                     System.out.println("FICHERO:\t" + listado[i]);
            }
        }else
            System.out.println("La ruta "+directorio.getPath()+" no es un directorio");
    }
    
    public static void main(String[] args)
    {      
        System.out.println("\n\nLlistar directori i indicar si es tracta de fitxer o element:");
        InformacionDeFicherosYDirectorios();
     }
}
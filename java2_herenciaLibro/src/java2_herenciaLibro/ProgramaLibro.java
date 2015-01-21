package java2_herenciaLibro;

public class ProgramaLibro {
	
	public static void main (String [ ] Args) {

        Novela novela  = new Novela();
        novela.setTipoLibro("Novela");
        novela.setPaginas(156);
        novela.setISBN("131-46-bad-4v");
        novela.setNombre("Los vecinos mueren en las novelas");
        novela.setEditorial("Norma");
        novela.setTipoNovela("Negra");
        novela.setArgumento("John Bland es el protagonista de la novela. Es escritorde novelas policiales. Hizo un par de ellas y no le fue muy bien. John nació en Irlanda y se mudó a Inglaterra posteriormente. Tiene como costumbre ir a visitara sus vecinos luego de mudarse. Se muda al campo, pensando que de esta forma podría retener a su esposa infiel. Una vez allí decide visitar a su única vecina:la señora Greenwold. Ella es una señora mayor aficionada a las novelas policiales. Ambos personajes dialogan examinándose y desconfiando el uno del otro. Luego deuna serie de relatos contados por ambas partes acerca de sus propias creaciones ficticias, John descubre que su vecina es la asesina de sus propios relatos, dela historia que ella acababa de contar como 'ficticia' John muere a causa de un veneno que su vecina había puesto en las tazas de té que le había ofrecidodurante la charla. John trata de escapar y llegar a su casa, pero es demasiado tarde. Muere antes de alcanzar el teléfono.");
        novela.setCapitulos(12);
        
        
        System.out.println("Tipo de libro: " + novela.getTipoLibro());
        System.out.println("Páginas: " + novela.getPaginas());
        System.out.println("ISBN: " + novela.getISBN() + " m2");
        System.out.println("Nombre: " + novela.getNombre());
        System.out.println("Editorial: "+ novela.getEditorial());
        System.out.println("Tipo: "+novela.getArgumento());
        System.out.println("Capitulos: "+novela.getCapitulos());
        novela.leer();
        System.out.println("\tClase: "+novela.getClass());
        System.out.println();
        
        
        Enciclopedia enci = new Enciclopedia();
        enci.setTipoLibro("Enciclopedia");
        enci.setPaginas(70163);
        enci.setISBN("135-78-ghb-7l");
        enci.setNombre("Lur Entziklopedia");
        enci.setEditorial("Lur Argitaletxea");
        enci.setTipo("clasico");
        enci.setTomos(10);
        enci.setConceptos(23546354);
        
        System.out.println("Tipo de libro: " + enci.getTipoLibro());
        System.out.println("Páginas: " + enci.getPaginas());
        System.out.println("ISBN: " + enci.getISBN() + " m2");
        System.out.println("Nombre: " + enci.getNombre());
        System.out.println("Editorial: "+ enci.getEditorial());
        System.out.println("Tipo: "+enci.getTipo());
        System.out.println("Tomos: "+enci.getTomos());
        System.out.println("Conceptos: "+enci.getConceptos());
        enci.leer();
        System.out.println("\tClase: "+enci.getClass());
        System.out.println();
        
        
        Didactico did = new Didactico();
        did.setTipoLibro("Didactico");
        did.setPaginas(230);
        did.setISBN("432-16-klñ-6r");
        did.setNombre("Baga-Biga");
        did.setEditorial("Elkar Argitaletxea");
        did.setTema("Matematica");
        did.setUnidadesDidacticas(28);
        
        System.out.println("Tipo de libro: " + did.getTipoLibro());
        System.out.println("Páginas: " + did.getPaginas());
        System.out.println("ISBN: " + did.getISBN() + " m2");
        System.out.println("Nombre: " + did.getNombre());
        System.out.println("Editorial: "+ did.getEditorial());
        System.out.println("Tema: "+did.getTema());
        System.out.println("Cantidad de unidades didacticas: "+did.getUnidadesDidacticas());
        did.leer();
        System.out.println("\tClase: "+did.getClass());
        System.out.println();
        
	}
	
}

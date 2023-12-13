package Prasanna;

public class enting {

        public static void main(String[] args) {
            String name = "Java is a Programming Language";
            String name1 = "java is a programming language";
            System.out.println("Name: " + name);
            System.out.println("UpperCase(): "+name.toUpperCase());
            System.out.println("Lowercase(): "+name.toLowerCase());
            System.out.println("First CharAt():"+name.charAt(0));
            System.out.println("Last CharAt():"+name.charAt(29));
            System.out.println("Length():"+name.length());
            System.out.println("SubString():"+name.substring(5));
            System.out.println("indexOf():"+name.indexOf('u'));
            System.out.println(name.lastIndexOf('e'));
            System.out.println("trim():"+name.trim( ));
            System.out.println("compareTo():"+name.compareTo(name1));
            System.out.println("concat:"+name.concat(" and platform independent"));
            System.out.println("replace():"+name.replace("Java","Python"));
            System.out.println("split():"+name.split("  "));
            System.out.println("trim():"+name.trim( ));
            System.out.println(         );
            System.out.println("Below methods Returns Boolean which is True or False");
            System.out.println("                        ");
            System.out.println("startsWith():"+name.startsWith("Java"));
            System.out.println("endsWith():"+name.endsWith("ge"));
            System.out.println("equals():"+name.equals(name1));
            System.out.println("equalsIgnoreCase():"+name.equalsIgnoreCase(name1));
            System.out.println("equals equals():"  + name==name1);
            System.out.println("contains():"+name.contains("is"));
            System.out.println("isEmpty():"+name.isEmpty());
            System.out.println("isBlank():"+name.isBlank());
        }
    }

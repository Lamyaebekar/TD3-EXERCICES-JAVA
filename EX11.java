class ConcatIncorrecte
{
    public static void main(String[] args)
        {
            String s = "China Blue";
            System.out.println(s);
            concat(s, " Express");
            System.out.println(s);

        }


    public static void concat(String s, String s2)
        {
            s +=s2;
        }
}
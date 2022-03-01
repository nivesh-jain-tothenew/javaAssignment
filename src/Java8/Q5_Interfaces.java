package Java8;

interface interface1 {

    default void show()
    {
        System.out.println("show is running from parent most interface");
    }
}

interface interface2 extends interface1
{
    default void show()
    {
        System.out.println("show is running from first child interface");
    }
}

interface interface3 extends interface1
{
    default void show()
    {
        System.out.println("show is running from second child interface");
    }
}

package hp;

public  class Person
{
    String s="class A";
}
class Name extends Person
{
    String e="class B";

    {
        System.out.println(super.s);
    }
}
class Pattern extends Name
{
    String n="class c";{
    System.out.println(super.e);
}}

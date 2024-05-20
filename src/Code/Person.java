public class Person
{

    private final String firstName;
    private final String lastName;
    private final int    birthYear;
    private String       married;
    private double       weightInPounds;
    private String       highestEducationLevel;

    public Person(final String firstName, final String lastName, final int birthYear, final String married, final double weightInPounds, final String highestEducationLevel)
    {
        this.firstName             = firstName;
        this.lastName              = lastName;
        this.birthYear             = birthYear;
        this.married               = married;
        this.weightInPounds        = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;
    }
}

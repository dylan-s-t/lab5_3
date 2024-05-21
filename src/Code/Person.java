

/**
 * This class models a person.
 * @author Annie Liang and Dylan Trerise
 * @version 1.0
 */
public class Person
{
    final String    firstName;
    final String    lastName;
    private String  marriageStatus;
    private String  educationLevel;

    private final int birthYear;

    private double weightLbs;

    public static final int CURRENT_YEAR = 2024;

    /**
     *
     * @param firstName         first name of person
     * @param lastName          last name of person
     * @param birthYear         birth year of person
     * @param marriageStatus    marital status of person(yes, no, or divorced)
     * @param weightLbs         person's weight in pounds
     * @param educationLevel    person's highest level of education(high school, undergraduate, or graduate)
     */
    public Person(final String firstName,
                  final String lastName,
                  final int birthYear,
                  final String marriageStatus,
                  final double weightLbs,
                  final String educationLevel)
    {
        this.firstName      = firstName;
        this.lastName       = lastName;
        this.birthYear      = birthYear;
        this.marriageStatus = marriageStatus;
        this.weightLbs      = weightLbs;
        this.educationLevel = educationLevel;
    }

    /**
     *
     * @param firstName         first name of person
     * @param lastName          last name of person
     * @param marriageStatus    marital status of person(yes, no, or divorced)
     * @param weightLbs         person's weight in pounds
     * @param educationLevel    person's highest level of education(high school, undergraduate, or graduate)
     */
    public Person(final String firstName,
          final String lastName,
          final String marriageStatus,
          final double weightLbs,
          final String educationLevel)
    {
        this.firstName      = firstName;
        this.lastName       = lastName;
        this.weightLbs      = weightLbs;
        this.educationLevel = educationLevel;
        this.marriageStatus = marriageStatus;

        this.birthYear = CURRENT_YEAR;
    }

    /**
     *
     * @param firstName first name of person
     * @param lastName  last name of person
     * @param weightLbs person's weight in pounds
     */
    public Person(final String firstName,
                  final String lastName,
                  final double weightLbs)

    {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.weightLbs  = weightLbs;

        this.birthYear = CURRENT_YEAR;
        this.marriageStatus = "no";
        this.educationLevel = "high school";
    }

    /**
     *
     * @return weight in pounds
     */
    public double getWeightLbs()
    {
        return weightLbs;
    }

    /**
     *
     * @return birth year
     */
    public int getBirthYear()
    {
        return birthYear;
    }

    /**
     *
     * @return marital status
     */
    public String getMarriageStatus()
    {
        if(marriageStatus.equalsIgnoreCase("divorced"))
        {
            marriageStatus = "divorced";
        }
        if(marriageStatus.equalsIgnoreCase("no"))
        {
            marriageStatus = "single";
        }
        if(marriageStatus.equalsIgnoreCase("yes"))
        {
            marriageStatus = "married";
        }
    return marriageStatus;
    }

    /**
     * converts education level to accolades received
     * @return highest level of education
     */
    public String getEducationLevel()
    {
        if(educationLevel.equalsIgnoreCase("high school"))
        {
            educationLevel = "high school diploma";
        }
        if(educationLevel.equalsIgnoreCase("undergraduate"))
        {
            educationLevel = "undergraduate degree";
        }
        if(educationLevel.equalsIgnoreCase("graduate"))
        {
           educationLevel = "graduate degree";
        }
    return educationLevel;
    }

    /**
     * checks if parameter is one of the three given options, if not, throws exception
     * @param educationLevelToVerify education level
     * @return true or exception
     * @throws IllegalArgumentException if parameter is not one of the 3 options
     */
    private boolean isValidEducationLevel(final String educationLevelToVerify)
    {
        if(educationLevelToVerify.equalsIgnoreCase("high school") ||
                educationLevelToVerify.equalsIgnoreCase("undergraduate") ||
                educationLevelToVerify.equals("graduate"))
        {
            return true;
        }
        else
        {
            throw new IllegalArgumentException("invalid education level");
        }
    }

    /**
     *
     * @return last name of person
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     *
     * @return first name of person
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * checks if marriage status parameter is one of the three options provided, if not, throws exception
     * @param marriageStatusToVerify marriage status
     * @return true if yes, no, or divorced
     * @throws IllegalArgumentException if not one of the three options
     */
    private boolean isValidMarriageStatus(final String marriageStatusToVerify)
    {
        if(marriageStatusToVerify.equalsIgnoreCase("yes") ||
                marriageStatusToVerify.equalsIgnoreCase("no") ||
                marriageStatusToVerify.equalsIgnoreCase("divorced"))
        {
             return true;
        }
        else
        {
            throw new IllegalArgumentException("invalid marriage status");
        }
    }

    /**
     * prints out all information in specified format
     */
    public void printDetails()
    {
        System.out.printf("%s %s (%s) was born in %d, weighs %.1f pounds, and has an %s!\n",
                this.getFirstName(),
                this.getLastName(),
                this.getMarriageStatus(),
                this.getBirthYear(),
                this.getWeightLbs(),
                this.getEducationLevel());
    }

    /**
     * converts weight in pounds to kilograms
     * @param weightLbs weight in pounds
     * @return weight in kilograms
     */
    public double weightKG(final double weightLbs)
    {
        return weightLbs * 0.4545;
    }

    /**
     * prints out all information in specified format
     * @param kilograms if true, converts weight given in pounds to kilograms
     */
    public void printDetails(final boolean kilograms)
    {
        if(kilograms)
        {
            System.out.printf("%s %s (%s) was born in %d, weighs %.1f kilograms, and has an %s!\n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getMarriageStatus(),
                    this.getBirthYear(),
                    this.weightKG(this.getWeightLbs()),
                    this.getEducationLevel());
        }
    }

    /**
     * prints out all information in specified format
     * @param kilograms if true, converts weight given in pounds to kilograms and prints in uppercase
     * @param uppercase if true, prints in uppercase
     */
    public void printDetails(final boolean kilograms, final boolean uppercase)
    {
        if(kilograms)
        {
            System.out.printf("%s %s (%s) was born in %d, weighs %.1f kilograms, and has an %s!\n",
                this.getFirstName().toUpperCase(),
                this.getLastName().toUpperCase(),
                this.getMarriageStatus(),
                this.getBirthYear(),
                this.weightKG(this.getWeightLbs()),
                this.getEducationLevel());
        }
        else
        {
            if(uppercase)
            {
                System.out.printf("%s %s (%s) was born in %d, weighs %.1f pounds, and has an %s!\n",
                    this.getFirstName().toUpperCase(),
                    this.getLastName().toUpperCase(),
                    this.getMarriageStatus(),
                    this.getBirthYear(),
                    this.getWeightLbs(),
                    this.getEducationLevel());
            }
            else
            {
                System.out.printf("%s %s (%s) was born in %d, weighs %.1f pounds, and has an %s!\n",
                        this.getFirstName().toLowerCase(),
                        this.getLastName().toLowerCase(),
                        this.getMarriageStatus(),
                        this.getBirthYear(),
                        this.getWeightLbs(),
                        this.getEducationLevel());
            }
        }

    }

    public static void main(final String[] args)
    {
        Person p1;
        Person p2;
        Person p3;

        p1 = new Person("Tiger", "Woods", 1975, "divorced", 200, "undergraduate");

        p1.printDetails();
        p1.printDetails(true);
        p1.printDetails(true, true);
        p1.printDetails(true, false);
        p1.printDetails(false, true);
        p1.printDetails(false, false);

        p2 = new Person("Jason", "Wilder", 2000, "no", 180, "graduate");

        p2.printDetails();
        p2.printDetails(true);
        p2.printDetails(true, true);
        p2.printDetails(true, false);
        p2.printDetails(false, true);
        p2.printDetails(false, false);

        p3 = new Person("Santa", "Claus", 1000, "yes", 280, "high school");
        p3.printDetails();
        p3.printDetails(true);
        p3.printDetails(true, true);
        p3.printDetails(true, false);
        p3.printDetails(false, true);
        p3.printDetails(false, false);
    }
}

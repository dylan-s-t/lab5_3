package ca.bcit.comp2501.lab3.anniedylan;

import java.time.*;
import java.util.*;

/**
 * This class models a person.
 *
 * @author Dylan Trerise and Annie x
 * @version 1.0
 */
public class Person
{
    private final String firstName;
    private final String lastName;
    private final int    birthYear;
    private String       married;
    private double       weightInPounds;
    private String       highestEducationLevel;

    // define constants
    public static final int    CURRENT_YEAR = Year.now().getValue();
    public static final double LB_TO_KG     = 0.45359237;

    /**
     *
     * @param firstName             the first name of the person
     * @param lastName              the last name of the person
     * @param birthYear             the year the person was born
     * @param married               the marriage status of the person either yes, no, or divorced
     * @param weightInPounds        the weight of the person in pounds
     * @param highestEducationLevel the highest education of the person, either high school, undergraduate or graduate
     */
    public Person(final String firstName,
                  final String lastName,
                  final int    birthYear,
                  final String married,
                  final double weightInPounds,
                  final String highestEducationLevel)
    {
        this.firstName             = firstName;
        this.lastName              = lastName;
        this.birthYear             = birthYear;
        this.married               = married;
        this.weightInPounds        = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;
    }

    /**
     *
     * @param firstName             the first name of the person
     * @param lastName              the last name of the person
     * @param married               the marriage status of the person either yes, no, or divorced
     * @param weightInPounds        the weight of the person in pounds
     * @param highestEducationLevel the highest education of the person, either high school, undergraduate or graduate
     */
    public Person(final String firstName,
                  final String lastName,
                  final String married,
                  final double weightInPounds,
                  final String highestEducationLevel)
    {
        this.firstName             = firstName;
        this.lastName              = lastName;
        this.married               = married;
        this.weightInPounds        = weightInPounds;
        this.highestEducationLevel = highestEducationLevel;

        this.birthYear             = CURRENT_YEAR;
    }

    /**
     *
     * @param firstName      the first name of the person
     * @param lastName       the last name of the person
     * @param weightInPounds the weight of the person in pounds
     */
    public Person(final String firstName,
                  final String lastName,
                  final double weightInPounds)
    {
        this.firstName             = firstName;
        this.lastName              = lastName;
        this.weightInPounds        = weightInPounds;

        this.birthYear             = CURRENT_YEAR;
        this.married               = "no";
        this.highestEducationLevel = "high school";
    }

    /**
     *
     * @param educationLevelToVerify the education level
     * @return true if the education level is either
     */
    private boolean isValidEducationLevel(String educationLevelToVerify)
    {
        if(     !Objects.equals(educationLevelToVerify, "high school")    ||
                !Objects.equals(educationLevelToVerify, "undergraduate")  ||
                !Objects.equals(educationLevelToVerify, "graduate"))
        {
            return true;
        }
        else
        {
            throw new IllegalArgumentException("bad education level");
        }
    }

    /**
     *
     * @param marriageStatusToVerify
     * @return
     */
    private boolean isValidMarriageStatus(String marriageStatusToVerify)
    {
        if(     Objects.equals(marriageStatusToVerify, "yes")  ||
                Objects.equals(marriageStatusToVerify, "no")   ||
                Objects.equals(marriageStatusToVerify, "divorced"))
        {
            return true;
        }
        else
        {
            throw new IllegalArgumentException("bad marriage status");
        }
    }

    /**
     *
     */
    public void printDetails()
    {
        System.out.printf("%s %s (%s) was born in %d, weighs %.1f pounds, and has a(n) %s degree!\n",
                this.getFirstName(),
                this.getLastName(),
                this.getMarried(),
                this.getBirthYear(),
                this.getWeightInPounds(),
                this.getHighestEducationLevel());
    }

    /**
     *
     * @param kilograms
     */
    public void printDetails(boolean kilograms)
    {
        double weightInKilograms;
        weightInKilograms = this.getWeightInPounds() * LB_TO_KG;

        System.out.printf("%s %s (%s) was born in %d, weighs %.1f kilograms, and has a(n) %s degree!\n",
                this.getFirstName(),
                this.getLastName(),
                this.getMarried(),
                this.getBirthYear(),
                weightInKilograms,
                this.getHighestEducationLevel());
    }

    /**
     *
     * @param kilograms
     * @param uppercase
     */
    public void printDetails(boolean kilograms,
                             boolean uppercase)
    {
        double weightInKilograms;
        weightInKilograms = this.getWeightInPounds() * LB_TO_KG;

        System.out.printf("%s %s (%s) was born in %d, weighs %.1f kilograms, and has a(n) %s degree!\n",
                this.getFirstName().toUpperCase(),
                this.getLastName().toUpperCase(),
                this.getMarried(),
                this.getBirthYear(),
                weightInKilograms,
                this.getHighestEducationLevel());
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getHighestEducationLevel()
    {
        return highestEducationLevel;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getMarried()
    {
        return married;
    }

    public double getWeightInPounds()
    {
        return weightInPounds;
    }

    public static void main(final String[] args)
    {
        Person p1;
        Person p2;
        Person p3;

        p1 = new Person("dylan", "tree", 124.5);
        p1.printDetails();
        p1.printDetails(true);
        p1.printDetails(true, true);
    }
}

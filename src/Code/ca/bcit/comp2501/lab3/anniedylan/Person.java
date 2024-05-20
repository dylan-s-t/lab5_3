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

    public static final int CURRENT_YEAR = Year.now().getValue();

    /**
     *
     * @param firstName
     * @param lastName
     * @param birthYear
     * @param married
     * @param weightInPounds
     * @param highestEducationLevel
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
     * @param firstName
     * @param lastName
     * @param married
     * @param weightInPounds
     * @param highestEducationLevel
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
     * @param firstName
     * @param lastName
     * @param weightInPounds
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
     * @param educationLevelToVerify
     * @return
     */
    private boolean isValidEducationLevel(String educationLevelToVerify)
    {
        if(     !Objects.equals(educationLevelToVerify, "yes")      ||
                !Objects.equals(educationLevelToVerify, "no")       ||
                !Objects.equals(educationLevelToVerify, "divorced"))
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
        if(     Objects.equals(marriageStatusToVerify, "high school")    ||
                Objects.equals(marriageStatusToVerify, "undergraduate")  ||
                Objects.equals(marriageStatusToVerify, "graduate"))
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

    }

    /**
     *
     * @param kilograms
     */
    public void printDetails(boolean kilograms)
    {

    }

    /**
     * 
     * @param kilograms
     * @param uppercase
     */
    public void printDetails(boolean kilograms, boolean uppercase)
    {

    }



}

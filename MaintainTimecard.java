import java.util.ArrayList;
import java.util.List;

// Class representing a single time entry
class TimeEntry {
    private String date;
    private int hoursWorked;
    private String chargeNumber;

    public TimeEntry(String date, int hoursWorked, String chargeNumber) {
        this.date = date;
        this.hoursWorked = hoursWorked;
        this.chargeNumber = chargeNumber;
    }

    public String getDate() {
        return date;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public String getChargeNumber() {
        return chargeNumber;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Hours: " + hoursWorked + ", Charge Number: " + chargeNumber;
    }
}

// Class representing a timecard for an employee
class Timecard {
    private String employeeId;
    private List<TimeEntry> entries;
    private boolean submitted;

    public Timecard(String employeeId) {
        this.employeeId = employeeId;
        this.entries = new ArrayList<>();
        this.submitted = false;
    }

    public void addEntry(String date, int hoursWorked, String chargeNumber) {
        if (submitted) {
            System.out.println("Cannot add entry. Timecard has already been submitted.");
            return;
        }
        TimeEntry entry = new TimeEntry(date, hoursWorked, chargeNumber);
        entries.add(entry);
        System.out.println("Entry added: " + entry);
    }

    public void editEntry(int index, String date, int hoursWorked, String chargeNumber) {
        if (submitted) {
            System.out.println("Cannot edit entry. Timecard has already been submitted.");
            return;
        }
        if (index < 0 || index >= entries.size()) {
            System.out.println("Invalid entry index.");
            return;
        }
        TimeEntry newEntry = new TimeEntry(date, hoursWorked, chargeNumber);
        entries.set(index, newEntry);
        System.out.println("Entry updated at index " + index + ": " + newEntry);
    }

    public void submit() {
        if (submitted) {
            System.out.println("Timecard has already been submitted.");
        } else {
            this.submitted = true;
            System.out.println("Timecard submitted successfully!");
        }
    }

    public List<TimeEntry> getEntries() {
        return entries;
    }

    public boolean isSubmitted() {
        return submitted;
    }
}

// Manager class for handling timecard operations
class TimecardManager {
    private List<Timecard> timecards;

    public TimecardManager() {
        this.timecards = new ArrayList<>();
    }

    public Timecard createTimecard(String employeeId) {
        Timecard timecard = new Timecard(employeeId);
        timecards.add(timecard);
        System.out.println("Timecard created for employee: " + employeeId);
        return timecard;
    }

    public Timecard getTimecard(String employeeId) {
        for (Timecard timecard : timecards) {
            if (timecard.getEntries().size() > 0 && !timecard.isSubmitted()) {
                return timecard;
            }
        }
        System.out.println("No timecard found for employee: " + employeeId);
        return null;
    }
}

// Main class to test the use case
public class MaintainTimecard {
    public static void main(String[] args) {
        TimecardManager manager = new TimecardManager();

        // Create a new timecard for an employee
        Timecard timecard = manager.createTimecard("E123");

        // Add entries to the timecard
        timecard.addEntry("2024-11-18", 8, "CH001");
        timecard.addEntry("2024-11-19", 6, "CH002");

        // Edit an entry in the timecard
        timecard.editEntry(1, "2024-11-19", 7, "CH002");

        // Submit the timecard
        timecard.submit();

        // Attempt to add another entry after submission
        timecard.addEntry("2024-11-20", 8, "CH003");
    }
}

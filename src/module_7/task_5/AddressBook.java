package module_7.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

public class AddressBook implements Iterable {
    private NameAddressPair[] addressBook;
    private int counter = 0;

    public AddressBook(int capacity) {
        addressBook = new NameAddressPair[capacity];
    }

    public boolean create(String firstName, String lastName, String address) {
        NameAddressPair.Person person = new NameAddressPair.Person(firstName, lastName);
        NameAddressPair nameAddressPair = new NameAddressPair(person, address);

        for (NameAddressPair pair : addressBook) {
            if (pair != null && pair.person.equals(person))
                return false;
        }

        if (counter >= addressBook.length) {
            NameAddressPair[] temp = new NameAddressPair[2 * addressBook.length];
            System.arraycopy(addressBook, 0, temp, 0, addressBook.length);
            addressBook = temp;
        }

        addressBook[counter] = nameAddressPair;
        counter++;
        return true;
    }

    public String read(String firstName, String lastName) {
        for (NameAddressPair nameAddressPair : addressBook) {
            if (nameAddressPair != null && nameAddressPair.person.firstName.equals(firstName)
                    && nameAddressPair.person.lastName.equals(lastName)) {
                return nameAddressPair.address;
            }
        }
        return null;
    }

    public boolean update(String firstName, String lastName, String address) {
        for (NameAddressPair nameAddressPair : addressBook) {
            if (nameAddressPair != null && nameAddressPair.person.firstName.equals(firstName)
                    && nameAddressPair.person.lastName.equals(lastName)) {
                nameAddressPair.address = address;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String firstName, String lastName) {
        List<NameAddressPair> list = new ArrayList<>(Arrays.asList(addressBook));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).person.firstName.equals(firstName)
                    && list.get(i).person.lastName.equals(lastName)) {
                list.remove(i);
                addressBook = list.toArray(new NameAddressPair[0]);
                return true;
            }
        }
        return false;
    }

    public int size() {
        int count = 0;

        for (NameAddressPair pair : addressBook) {
            if (pair != null)
                count++;
        }

        return count;
    }

    public void sortedBy(SortOrder order) {
        if (order == SortOrder.ASC) {
            Arrays.sort(addressBook, comparatorASC);
        } else if (order == SortOrder.DESC) {
            Arrays.sort(addressBook, comparatorDESC);
        } else
            System.out.println("No right order");
    }

    @Override
    public Iterator iterator() {
        return new AddressBookIterator();
    }

    private class AddressBookIterator implements Iterator {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < addressBook.length && addressBook[counter] != null;
        }

        @Override
        public String next() {
            counter++;
            return String.format("First name: %s, Last name: %s, Address: %s",
                    addressBook[counter - 1].person.firstName, addressBook[counter - 1].person.lastName,
                    addressBook[counter - 1].address);
        }
    }

    Comparator<AddressBook.NameAddressPair> comparatorASC = new Comparator<AddressBook.NameAddressPair>() {
        @Override
        public int compare(AddressBook.NameAddressPair o1, AddressBook.NameAddressPair o2) {
            int result = 0;
            if (o1 != null && o2 != null) {
                result = o1.person.firstName.compareTo(o2.person.firstName);
                if (result == 0)
                    result = o1.person.lastName.compareTo(o2.person.lastName);
            }
            return result;
        }
    };

    Comparator<NameAddressPair> comparatorDESC = new Comparator<NameAddressPair>() {
        @Override
        public int compare(NameAddressPair o1, NameAddressPair o2) {
            int result = 0;
            if (o1 != null && o2 != null) {
                result = o2.person.firstName.compareTo(o1.person.firstName);
                if (result == 0)
                    result = o2.person.lastName.compareTo(o1.person.lastName);
            }
            return result;
        }
    };

    private static class NameAddressPair {
        private final Person person;
        private String address;

        private NameAddressPair(Person person, String address) {
            this.person = person;
            this.address = address;
        }

        @Override
        public String toString() {
            return person.toString() + ", Address: " + address;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((address == null) ? 0 : address.hashCode());
            result = prime * result + ((person == null) ? 0 : person.hashCode());
            return result;
        }

        private static class Person {
            private final String firstName;
            private final String lastName;

            private Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            @Override
            public String toString() {
                return "First name: " + firstName + ", Last name: " + lastName;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                Person other = (Person) obj;
                if (firstName == null) {
                    if (other.firstName != null)
                        return false;
                } else if (!firstName.equals(other.firstName))
                    return false;
                if (lastName == null) {
                    if (other.lastName != null)
                        return false;
                } else if (!lastName.equals(other.lastName))
                    return false;
                return true;
            }
        }
    }

    public static void main(String[] args) {
        String[] expected = { "First name: Karen, Last name: Davis, Address: Address #2",
                "First name: Steven, Last name: Taylor, Address: Address #3",
                "First name: Susan, Last name: Brown, Address: Address #4" };
        String[] actual = new String[3];
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        addressBook.create("Susan", "Brown", "Address #4");
        addressBook.update("Steven", "Taylor", "Address #3");
        addressBook.delete("John", "Brown");
        int counter = 0;
        for (Object record : addressBook) {
            actual[counter++] = record.toString();
        }
        System.out.println(Arrays.equals(expected, actual));
    }
}

enum SortOrder {
    ASC, DESC
}
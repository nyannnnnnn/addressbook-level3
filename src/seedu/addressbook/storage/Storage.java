package seedu.addressbook.storage;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.Storage.java

public class Storage {
    public void save(AddressBook addressBook) throws StorageOperationException;
    public AddressBook load() throws StorageOperationException;
    public String getPath();
}

package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//create a class using the MOdel ( in entity folder JournalEntry.java) so that we create object of the class and use it in the controller
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}

package pl.mloza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import pl.mloza.entities.JsonbEntity;
import pl.mloza.entities.JsonbObject;
import pl.mloza.repositories.JsonbRepository;

import java.util.Optional;

@SpringBootTest
public class RepositoryTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private JsonbRepository repository;

    @Test
    public void shouldSaveDataInJSONB() {
        JsonbObject jsonbObject = new JsonbObject()
                .setIntArrayField(new int[]{1, 3, 5, 9})
                .setIntField(10)
                .setStringField("String field tests");

        jsonbObject
                .getMapField()
                .put("test", "value");

        jsonbObject.getMapField().put("test2", "another value");

        JsonbEntity jsonbEntity = new JsonbEntity()
                .setJsonbObject(jsonbObject);

        JsonbEntity entity = repository.save(jsonbEntity);

        Optional<JsonbEntity> jsonbObjectNew = repository.findById(entity.getId());
        System.out.println(jsonbObjectNew);
    }
}

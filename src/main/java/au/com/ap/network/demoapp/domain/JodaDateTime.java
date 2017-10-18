package au.com.ap.network.demoapp.domain;

import au.com.ap.network.demoapp.dao.JodaDateTimeUserType;
import org.hibernate.annotations.TypeDef;
import org.joda.time.DateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass // Workaground to get Hibernate to pick it up
@TypeDef(defaultForType = DateTime.class, typeClass = JodaDateTimeUserType.class)

public class JodaDateTime {
}

package org.apereo.cas.adaptors.gauth.token;

import org.apereo.cas.category.MariaDbCategory;
import org.apereo.cas.util.junit.ConditionalIgnore;
import org.apereo.cas.util.junit.RunningContinuousIntegrationCondition;

import org.junit.experimental.categories.Category;
import org.springframework.test.context.TestPropertySource;

/**
 * This is {@link MariaDbGoogleAuthenticatorJpaTokenRepositoryTests}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0
 */
@TestPropertySource(locations = "classpath:gauth-mariadb.properties")
@ConditionalIgnore(condition = RunningContinuousIntegrationCondition.class, port = 3306)
@Category(MariaDbCategory.class)
public class MariaDbGoogleAuthenticatorJpaTokenRepositoryTests extends GoogleAuthenticatorJpaTokenRepositoryTests {

}

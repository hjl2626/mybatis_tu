package mybatis.test;

import com.java.model.dao.BasketMapper;
import com.java.model.domain.Basket;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hjl on 2016/12/6.
 */
public class BasketTest {

	public String resource = "mybatis-config.xml";
	public SqlSessionFactory sqlSessionFactory;
	public static Logger logger = Logger.getLogger(BasketTest.class);

	@Before
	public void setUp() throws IOException {

		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testInsert() {
		SqlSession session = sqlSessionFactory.openSession(true);
		BasketMapper testMapper = session.getMapper(BasketMapper.class);
		logger.info(testMapper.insertSelective(new Basket()));
		session.close();

	}
}

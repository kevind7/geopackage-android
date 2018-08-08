package mil.nga.geopackage.test.extension;

import java.sql.SQLException;

import mil.nga.geopackage.test.CreateGeoPackageTestCase;

/**
 * Test RTree Extension from a created database
 *
 * @author osbornb
 */
public class RTreeIndexExtensionCreateTest extends CreateGeoPackageTestCase {

    /**
     * Constructor
     */
    public RTreeIndexExtensionCreateTest() {

    }

    /**
     * Test RTree
     *
     * @throws SQLException upon error
     */
    public void testRTree() throws SQLException {

        RTreeIndexExtensionUtils.testRTree(geoPackage);

    }

    @Override
    public boolean allowEmptyFeatures() {
        return false;
    }

}

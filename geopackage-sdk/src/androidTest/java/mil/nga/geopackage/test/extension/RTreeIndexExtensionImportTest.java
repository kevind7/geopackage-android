package mil.nga.geopackage.test.extension;

import java.sql.SQLException;

import mil.nga.geopackage.test.ImportGeoPackageTestCase;

/**
 * Test RTree Extension from an imported database
 *
 * @author osbornb
 */
public class RTreeIndexExtensionImportTest extends ImportGeoPackageTestCase {

    /**
     * Constructor
     */
    public RTreeIndexExtensionImportTest() {

    }

    /**
     * Test RTree
     *
     * @throws SQLException upon error
     */
    public void testRTree() throws SQLException {

        RTreeIndexExtensionUtils.testRTree(geoPackage);

    }

}

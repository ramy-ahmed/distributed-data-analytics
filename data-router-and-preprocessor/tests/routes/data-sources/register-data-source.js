const faker = require('faker');
const nock = require('nock');
const Promise = require('bluebird');

const app = require('../../../server');
const requests = require('../../requests');

// Tests the data source registration.
const testRegisterDataSource = () => {
  describe('POST @ /data-sources', () => {
    it('should register a data source', () => {
      const dataSourceDefinitionReferenceID = faker.random.uuid();
      nock(`${ process.env.MODEL_REPOSITORY_BASE_URL }`)
        .get(`/data-source-definitions/${ dataSourceDefinitionReferenceID }`).reply(200);
      const data = {
        ...{
          macAddress: faker.internet.mac(),
          dataSourceDefinitionReferenceID
        },
        ...(faker.random.boolean() ? {
          dataSourceDefinitionInterfaceParameters: {
            parameter: [
              {
                key: faker.random.words(2),
                value: faker.random.boolean() ? faker.random.words(2) : faker.random.number(0, 100)
              }
            ]
          }
        } : { })
      };
      const p = Promise.try(() => {
        return requests.cpost(app, '/api/data-sources', data);
      });
      return Promise.all([
        p.should.eventually.have.property('statusCode', 201),
        p.should.eventually.have.property('body').that.is.an('object')
      ]);
    });
  });
};

module.exports = testRegisterDataSource;

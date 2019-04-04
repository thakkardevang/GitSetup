#!/usr/bin/env groovy 

/*
 * This file bootstraps the codified Continuous Delivery pipeline for SAP S/4HANA extensions.
 * The pipeline helps you to deliver software changes quickly and in a reliable manner.
 * A suitable Jenkins instance is required to run the pipeline.
 * The Jenkins can easily be bootstraped using the life-cycle script located inside the 'cx-server' directory.
 *
 * More information on getting started with Continuous Delivery can be found in the following places:
 *   - GitHub repository: https://github.com/SAP/cloud-s4-sdk-pipeline
 *   - Blog Post: https://blogs.sap.com/2017/09/20/continuous-integration-and-delivery
 */

/*
 * Set pipelineVersion to a fixed released version (e.g. "v15") when running in a productive environment.
 * To find out about available versions and release notes, visit: https://github.com/SAP/cloud-s4-sdk-pipeline/releases
 */
node {
    deleteDir()
    stage('Source') {

            git(branch: ${pipelineVersion}, credentialsId: ${credentialId}, url: 'https://github.com/CapgeminiAutoCloud/PipelineApp.git')
        

            load './pipelines/s4sdk-pipeline.groovy'
        }
    }

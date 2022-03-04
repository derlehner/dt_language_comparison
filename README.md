# Comparing Modeling Capabilities of Digital Twin Platforms

This repository comprises the artifacts required for a comparison of modeling capabilities of three different Digital Twin Platforms (offered by Microsoft Azure, Eclipse, and Amazon Web Services).
The results of this comparison have been submitted to ECMFA 2022 with the title "Modeling Capabilities of Digital Twin Platforms - Old Wine in New Bottles?".

## Metamodels
As a first contribution, we derived the metamodels describing the modeling capabilities of the individual platforms. 

### 1. DTDL-MM
The ecore representation of the metamodel of the Digital Twin Definition Language (DTDL) used by the Azure Digital Twins Service is available in the folder /metamodels/DTML (This project has to be imported into the Eclipse workspace. Then, the ecore file is available via /DTML/model)

### 2. Vortolang-MM
The ecore representation of the metamodel of the Vortolang, used by the Eclipse Vorto project, is available in the folder /metamodels/vortolang. This project is cloned from the official documentation of the Vorto tool available on github. Import this project into your Eclipse workspace, and all necessary ecore files will be available via /vortolang/model.

### 3. TM-MM
The eclipse-representation of the metamodel of the AWS TwinMaker is derived from the documentation of the TwinMaker REST API, and available in the folder /metamodels/aws (Again, this project has to be imported into the Eclipse workspace. Then, the ecore file is available via /DTML/model).


## Example Models
To showcase the use of the derived metamodels, we implemented an air quality example ([also available on github](https://github.com/derlehner/IndoorAirQuality_DigitalTwin_Exemplar/tree/main/digital_twin/models)) in all three of them, and in UML. The created models are available in the folder /examples

## Formal Comparison
A detailed comparison of the modeling concepts used by the individual modeling concepts, in the context of standardized object-oriented modeling concepts offered by UML, is available in the file /comparison.xlsx.

## Extending UML to enable Platform Portability
To enable platform portability, we propose to extend UML with the functionality, and use this extended UML syntax (DTUML) as pivot for platform languages. Therefore, we created the DTUML profile, which is available in the folder /examples/uml/profiles.

## Transformations
To showcase this DTUML-enabled portability, we created two transformations.
- The DTDL2UML transformation that transforms models created with the DTDL-MM to models conforming to the DTUML metamodel (UML class diagrams extended with the DTUML syntax)
- the UML2TM transformation that transforms DTUML models to the TM-MM.

Both transformations are available in the folder /transformations.

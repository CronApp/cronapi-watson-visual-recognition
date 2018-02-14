package cronapi.watson.visual_recognition;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData(categoryName = "Watson Visual Recognition",
    categoryTags = {"Watson", "Visual", "Recognition"})
public final class VisualRecognitionOperations {

  @CronapiMetaData(
      name = "{{classifyName}}",
      description = "{{classifyDescription}}"
  )
  public static ClassifiedImages classify(String versionDate, String apiKey, String endPoint,
                                          Map<String, String> headers, ClassifyOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);
    return service.classify(options).execute();
  }

  @CronapiMetaData(
      name = "{{detectFacesName}}",
      description = "{{detectFacesDescription}}"
  )
  public static DetectedFaces detectFaces(String versionDate, String apiKey, String endPoint,
                                          Map<String, String> headers, DetectFacesOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.detectFaces(options).execute();
  }

  @CronapiMetaData(
      name = "{{createClassifierName}}",
      description = "{{createClassifierDescription}}"
  )
  public static Classifier createClassifier(String versionDate, String apiKey, String endPoint,
                                            Map<String, String> headers, CreateClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createClassifier(options).execute();
  }

  @CronapiMetaData(
      name = "{{deleteClassifierName}}",
      description = "{{deleteClassifierDescription}}"
  )
  public static void deleteClassifier(String versionDate, String apiKey, String endPoint,
                                      Map<String, String> headers, DeleteClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteClassifier(options).execute();
  }

  @CronapiMetaData(
      name = "{{getClassifierName}}",
      description = "{{getClassifierDescription}}"
  )
  public static Classifier getClassifier(String versionDate, String apiKey, String endPoint,
                                         Map<String, String> headers, GetClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getClassifier(options).execute();
  }

  @CronapiMetaData(
      name = "{{listClassifiersName}}",
      description = "{{listClassifiersDescription}}"
  )
  public static Classifiers listClassifiers(String versionDate, String apiKey, String endPoint,
                                            Map<String, String> headers, ListClassifiersOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listClassifiers(options).execute();
  }

  @CronapiMetaData(
      name = "{{updateClassifierName}}",
      description = "{{updateClassifierDescription}}"
  )
  public static Classifier updateClassifier(String versionDate, String apiKey, String endPoint,
                                            Map<String, String> headers, UpdateClassifierOptions updateClassifierOptions) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateClassifier(updateClassifierOptions).execute();
  }
}

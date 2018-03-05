package cronapi.watson.visual_recognition;

import com.ibm.watson.developer_cloud.http.ServiceCall;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData
public final class VisualRecognitionOperations {

  @CronapiMetaData
  public static ClassifiedImages classify(String versionDate, String apiKey, String endPoint,
                                          Map<String, String> headers, ClassifyOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);
    return service.classify(options).execute();
  }

  @CronapiMetaData
  public static DetectedFaces detectFaces(String versionDate, String apiKey, String endPoint,
                                          Map<String, String> headers, DetectFacesOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.detectFaces(options).execute();
  }

  @CronapiMetaData
  public static Classifier createClassifier(String versionDate, String apiKey, String endPoint,
                                            Map<String, String> headers, CreateClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createClassifier(options).execute();
  }

  @CronapiMetaData
  public static void deleteClassifier(String versionDate, String apiKey, String endPoint,
                                      Map<String, String> headers, DeleteClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteClassifier(options).execute();
  }

  @CronapiMetaData
  public static Classifier getClassifier(String versionDate, String apiKey, String endPoint,
                                         Map<String, String> headers, GetClassifierOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getClassifier(options).execute();
  }

  @CronapiMetaData
  public static Classifiers listClassifiers(String versionDate, String apiKey, String endPoint,
                                            Map<String, String> headers, ListClassifiersOptions options) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listClassifiers(options).execute();
  }

  @CronapiMetaData
  public static Classifier updateClassifier(String versionDate, String apiKey, String endPoint,
                                            Map<String, String> headers, UpdateClassifierOptions updateClassifierOptions) {
    VisualRecognition service = new VisualRecognition(versionDate);
    service.setApiKey(apiKey);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateClassifier(updateClassifierOptions).execute();
  }
}
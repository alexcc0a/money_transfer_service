FROM node:14.18.1-alpine3.11
EXPOSE 3000
ADD ./ /front
WORKDIR /front
RUN npm install
ENTRYPOINT ["npm", "run", "start"]